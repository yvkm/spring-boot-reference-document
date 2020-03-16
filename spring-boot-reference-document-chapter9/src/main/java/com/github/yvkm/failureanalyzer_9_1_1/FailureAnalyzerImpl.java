package com.github.yvkm.failureanalyzer_9_1_1;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author xie jian xun
 * @since
 */
public class FailureAnalyzerImpl extends AbstractFailureAnalyzer<ArithmeticException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, ArithmeticException cause) {
        return new FailureAnalysis(getCauseType() + ":" + cause.getMessage(), "please check", cause);

    }
}
