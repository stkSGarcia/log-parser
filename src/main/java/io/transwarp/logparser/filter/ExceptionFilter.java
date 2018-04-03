package io.transwarp.logparser.filter;

import io.transwarp.logparser.util.Record;

import java.util.Optional;

/**
 * Author: stk
 * Date: 2018/4/2
 */
public class ExceptionFilter implements Filter {
    @Override
    public boolean filter(Record record) {
        return Optional.of(record).map(Record::isException).orElse(false);
    }
}