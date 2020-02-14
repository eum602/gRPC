package com.eum602.protobuf;

import my.job.JobOuterClass.Job;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Job.Builder builder = Job.newBuilder();//creating a new instance of Job proto, which was created before
        //by simply running a hello world here.
        //setting a company name for the new Job instance
        builder.setCompany("Acme");
        builder.setExperienceTime(3);
        builder.setDescription("Bsc Mechatronics Engineering");
        builder.setIsCurrentlyWorking(true);
    }
}
