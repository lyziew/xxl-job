package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSFWSL
 * @author 
 */
@Data
public class TaskInstance implements Serializable {
    private Long XH;

    private Long LCSLXH;

    private String RWXH;

    private Short YXZT;

    private String JSJG;

    private Date CJSJ;

    private Date GXSJ;

    private Long DDRZXH;

    private String CSLB;

    private static final long serialVersionUID = 1L;
}