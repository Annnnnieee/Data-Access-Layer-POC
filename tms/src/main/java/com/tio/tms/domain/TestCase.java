package com.tio.tms.domain;
import javax.persistence.*;

@Entity
public class TestCase {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String testCaseName;

    private String flowName;

    private String dataSetSource;

    public TestCase(){
    }
    public TestCase(String testCaseName, String flowName, String dataSetSource){
        this.testCaseName = testCaseName;
        this.dataSetSource = dataSetSource;
        this.flowName = flowName;
    }

    public String getDataSetSource() {
        return dataSetSource;
    }

    public void setDataSetSource(String dataSetSource) {
        this.dataSetSource = dataSetSource;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getflowName() {
        return flowName;
    }

    public void setFflowName(String flowName) {
        this.flowName = flowName;
    }

}
