package org.introsoftengi.termprojectharrison.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.introsoftengi.termprojectharrison.enums.ResponseStatus;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseVO<T> {
    private String statusMessage;
    private String errorMessage;
    private ResponseStatus responseStatus;
    private Integer code;
    private T data;

    @Override
    public String toString() {
        return "ResponseVO{" +
                "statusMessage='" + statusMessage + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", responseStatus=" + responseStatus +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
