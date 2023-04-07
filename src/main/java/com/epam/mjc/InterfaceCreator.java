package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public Operation<Integer> divideBy(Integer divider) {

        return (l) -> {
            List<Integer> r = new ArrayList<>();
            for (int i = 0; i < l.size(); i++) {
                r.add(l.get(i) / divider);
            }
            return r;
        };

    }
}
