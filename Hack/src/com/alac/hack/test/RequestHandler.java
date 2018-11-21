package com.alac.hack.test;
import com.amazonaws.services.lambda.runtime.Context;

public interface RequestHandler <I, O>{
    /**
     * Handles a Lambda function request
     * @param input The Lambda function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda function output
     */
    public O handleRequest(I input, Context context);
}
