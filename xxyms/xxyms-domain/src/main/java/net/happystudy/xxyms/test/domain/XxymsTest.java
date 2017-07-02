package net.happystudy.xxyms.test.domain;

import java.io.Serializable;

public class XxymsTest implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer testId;
    
    private String testName;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
    
}
