package org.introsoftengi.termprojectharrison.enums;

public enum ResponseStatus {

    SUCCESS("Success"),
    WARNING("Warning"),
    FAILED("Failed"),
    ERROR("Error"),
    BAD_REQUEST("Bad Request"),
    UNAUTHORIZED("Unauthorized"),
    NOT_FOUND("Not Found"),
    CONFLICT("Conflict"),
    FORBIDDEN("Forbidden"),
    PROCESSING("Processing"),
    ALREADY_REPORTED("Already Reported"),
    FAILED_DEPENDENCY("Failed Dependency");



    private final String status;

    ResponseStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
