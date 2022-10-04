package com.didimo.challenge.service;

import com.didimo.challenge.AlgoUtil;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class AlticciChallengeService implements ChallengeService {

    @Override
    public List<Long> resolve(Long n) {
        return resolveAlticci(n);
    }

    private List<Long> resolveAlticci(Long n) {
        List<Long> values = new ArrayList<>();
        for (int c = 0; c <= n; c++) {
            if (c == 0) {
                values.add(0L);
                continue;
            }
            if (c <= 2) {
                values.add(1L);
                continue;
            }
            values.add(AlgoUtil.sum(values.get(c - 3), values.get(c-2)));
        }
        return values;
    }

}
