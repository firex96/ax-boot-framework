package com.chequer.axboot.core.vo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import java.util.Locale;

@Data
public class ScriptSessionVO {

    protected String userCd;

    protected String userNm;

    protected String compCd;

    protected String storCd;

    protected Locale locale;

    protected String timeZone;

    protected String dateFormat;

    protected boolean login = true;

    @Getter(AccessLevel.NONE)
    protected String dateTimeFormat;

    protected String timeFormat;

    public String getDateTimeFormat() {
        return dateFormat + " " + timeFormat;
    }

    public static ScriptSessionVO noLoginSession() {
        ScriptSessionVO scriptSessionVO = new ScriptSessionVO();
        scriptSessionVO.setLogin(false);
        return scriptSessionVO;
    }
}
