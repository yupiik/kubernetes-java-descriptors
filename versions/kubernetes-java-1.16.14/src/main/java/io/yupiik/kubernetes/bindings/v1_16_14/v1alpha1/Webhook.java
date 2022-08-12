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
package io.yupiik.kubernetes.bindings.v1_16_14.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_14.Validable;
import io.yupiik.kubernetes.bindings.v1_16_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Webhook implements Validable<Webhook>, Exportable {
    private WebhookClientConfig clientConfig;
    private WebhookThrottleConfig throttle;

    public Webhook() {
        // no-op
    }

    public Webhook(final WebhookClientConfig clientConfig,
                   final WebhookThrottleConfig throttle) {
        // no-op
    }

    public WebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public WebhookThrottleConfig getThrottle() {
        return throttle;
    }

    public void setThrottle(final WebhookThrottleConfig throttle) {
        this.throttle = throttle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                throttle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Webhook)) {
            return false;
        }
        final Webhook __otherCasted = (Webhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(throttle, __otherCasted.throttle);
    }

    public Webhook clientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public Webhook throttle(final WebhookThrottleConfig throttle) {
        this.throttle = throttle;
        return this;
    }

    @Override
    public Webhook validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (clientConfig == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "clientConfig", "clientConfig",
                "Missing 'clientConfig' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clientConfig != null ? "\"clientConfig\":" + clientConfig.asJson() : ""),
                    (throttle != null ? "\"throttle\":" + throttle.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
