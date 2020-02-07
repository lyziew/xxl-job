package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSFW
 * @author 
 */
@Data
public class Task implements Serializable {
    private String XH;

    private String MC;

    private String CJZ;

    private String MS;

    private String BB;

    private Date CJSJ;

    private Date GXSJ;

    private Short ZT;

    private String PZ;

    private static final long serialVersionUID = 1L;
}