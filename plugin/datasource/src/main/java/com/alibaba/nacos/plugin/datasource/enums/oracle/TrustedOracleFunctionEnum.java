package com.alibaba.nacos.plugin.datasource.enums.oracle;

import java.util.HashMap;
import java.util.Map;

/**
 * Trusted oracle functions enumeration.
 */
public enum TrustedOracleFunctionEnum {

    /**
     * Current timestamp.
     */
    NOW("NOW()", "SYSTIMESTAMP");

    private static final Map<String, TrustedOracleFunctionEnum> LOOKUP_MAP = new HashMap<>();

    static {
        for (TrustedOracleFunctionEnum entry : TrustedOracleFunctionEnum.values()) {
            LOOKUP_MAP.put(entry.functionName, entry);
        }
    }

    private final String functionName;

    private final String function;

    TrustedOracleFunctionEnum(String functionName, String function) {
        this.functionName = functionName;
        this.function = function;
    }

    /**
     * Get the real sql function by name.
     *
     * @param functionName function name
     * @return real function
     */
    public static String getFunctionByName(String functionName) {
        TrustedOracleFunctionEnum entry = LOOKUP_MAP.get(functionName);
        if (entry != null) {
            return entry.function;
        }
        throw new IllegalArgumentException("Invalid function name: " + functionName);
    }
}
