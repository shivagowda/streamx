package com.streamxhub.spark.monitor.core.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@TableName("t_spark_monitor")
public class SparkMonitor {

    @NotBlank(message = "{required}")
    @TableId(value = "MY_ID", type = IdType.INPUT)
    private String myId;

    @NotBlank(message = "{required}")
    private String appId;

    @NotBlank(message = "{required}")
    private String appName;

    @NotBlank(message = "{required}")
    private String confVersion;

    private String trackUrl;

    private String startUp;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public SparkMonitor() {
    }

    public SparkMonitor(String id, String appId, String appName, String confVersion, Integer status, String startUp) {
        this.myId = id;
        this.appId = appId;
        this.appName = appName;
        this.confVersion = confVersion;
        this.status = status;
        this.startUp = startUp;
    }

}