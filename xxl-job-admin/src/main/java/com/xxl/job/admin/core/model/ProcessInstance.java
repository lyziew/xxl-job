package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSLCSL
 * @author 
 */
@Data
public class ProcessInstance implements Serializable {
    private Long XH;

    private String QQXH;

    private String LCXH;

    private Short YXZT;

    private Date CJSJ;

    private Date GXSJ;

    private String CSLB;

    private String JSJG;

    private static final long serialVersionUID = 1L;
}