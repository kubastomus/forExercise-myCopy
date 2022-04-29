package com.company.ZaawJavaSDA.ZaawExcZad1;

import com.company.ZaawJavaSDA.ZaawExcZad1.CannotDivideBy0;

class MathExample {
    public static float divide(int a, int b) throws CannotDivideBy0 {
        if (b == 0) {
            throw new CannotDivideBy0();
        }
        return a / b;
    }
}
