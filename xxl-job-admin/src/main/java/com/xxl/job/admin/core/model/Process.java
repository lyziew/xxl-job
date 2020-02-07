package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSLC
 * @author 
 */
@Data
public class Process implements Serializable {
    private String XH;

    private String MC;

    private String CJZ;

    private String MS;

    private String BB;

    private Short ZT;

    private Date CJSJ;

    private Date GXSJ;

    private String PZ;

    private static final long serialVersionUID = 1L;
}