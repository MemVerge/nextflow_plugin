package com.memverge.nextflow

import groovy.transform.CompileStatic
import nextflow.Session
import nextflow.trace.TraceObserver
import nextflow.trace.TraceObserverFactory

@CompileStatic
class FloatFactory implements TraceObserverFactory {
    @Override
    Collection<TraceObserver> create(Session session) {
        return new ArrayList()
    }
}
