package br.com.lucasbertoloto.service;

import java.math.BigDecimal;

public enum Performance {
    GOOD{
        @Override
        public BigDecimal getPercentageReadjustment() {
            return new BigDecimal("0.15");
        }
    },
    GREAT {
        @Override
        public BigDecimal getPercentageReadjustment() {
            return new BigDecimal("0.20");
        }
    },
    TO_DESIRED {
        @Override
        public BigDecimal getPercentageReadjustment() {
            return new BigDecimal("0.03");
        }
    };

    public abstract BigDecimal getPercentageReadjustment();
}
