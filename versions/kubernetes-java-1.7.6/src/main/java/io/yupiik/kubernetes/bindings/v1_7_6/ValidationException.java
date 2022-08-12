/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_7_6;

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

