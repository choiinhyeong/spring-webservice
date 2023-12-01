package com.choi.webservice.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.*;

public final class CommonResponse<T> {

    private Map<String, Object> status;
    private T data;

    public CommonResponse(ResponseCodes responseCodes, T unmodifiableMap) {
    }

    public void addStatus(String key, Object value) {
        status.put(key, value);
    }

    public static final class Builder {
        private final ResponseCodes responseCodes;
        private final Map<String, Object> status = new LinkedHashMap<>();
        private final Map<String, Object> data = new LinkedHashMap<>();

        public Builder(ResponseCodes responseCodes) {
            this.responseCodes = responseCodes;
        }

        public Builder() {
            this(ResponseCodes.SUCCESS);
        }

        public Builder addStatus(String k1, Object v1){
            status.put(k1, v1);
            return this;
        }

        public Builder addData(String k1, Object v1){
            data.put(k1, v1);
            return this;
        }

        public Builder addItems(Collection items){
            data.put("items", items!=null ? items : new ArrayList());
            return this;
        }

        public Builder addDataResultCode(ResponseCodes responseCodes){
            if (responseCodes != null) {
                return addData("resultType", responseCodes.getClass().getSimpleName());
            }
            return this;
        }

        public CommonResponse build(){
            CommonResponse<Map<String, Object>> commonResponse = new CommonResponse<>(responseCodes, Collections.unmodifiableMap(data));
            for(Map.Entry<String, Object> map : status.entrySet()){
                commonResponse.addStatus(map.getKey(), map.getValue());
            }
            return commonResponse;
        }
    }

}
