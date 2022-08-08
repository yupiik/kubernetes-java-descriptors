package io.yupiik.kubernetes.bindings.v1_16_7;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class ValidationException extends RuntimeException {
    private List<ValidationError> errors;

    public ValidationException(final List<ValidationError> errors) {
        super(errors.stream().map(ValidationError::getMessage).collect(joining(", ")));
        this.errors = errors;
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    public static class ValidationError {
        private final String javaName;
        private final String jsonName;
        private final String message;
        private final boolean required;

        public ValidationError(final String java, final String json, final String message, final boolean required) {
            this.javaName = java;
            this.jsonName = json;
            this.message = message;
            this.required = required;
        }

        public boolean isRequired() {
            return required;
        }

        public String getJavaName() {
            return javaName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String getMessage() {
            return message;
        }
    }
}

