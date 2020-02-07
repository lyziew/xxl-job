package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSQQ
 * @author 
 */
@Data
public class Request implements Serializable {
    private String XH;

    private String LCXH;

    private String DYZ;

    private Short SCSJGS;

    private Short SCZTGS;

    private Short YXZT;

    private Date CJSJ;

    private Date GXSJ;

    private String CSLB;

    private String JSJG;

    private static final long serialVersionUID = 1L;
}