package com.streamxhub.spark.monitor.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@TableName("t_spark_monitor")
public class SparkMonitor {

    @NotBlank(message = "{required}")
    @TableId(value = "MONITOR_ID", type = IdType.INPUT)
    private String monitorId;

    @NotBlank(message = "{required}")
    private String appId;

    @NotBlank(message = "{required}")
    private String appName;

    @NotBlank(message = "{required}")
    private String confVersion;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public SparkMonitor() {
    }

    public SparkMonitor(String id, String appId, String appName, String confVersion, Integer status) {
        this.monitorId = id;
        this.appId = appId;
        this.appName = appName;
        this.confVersion = confVersion;
        this.status = status;
    }
}