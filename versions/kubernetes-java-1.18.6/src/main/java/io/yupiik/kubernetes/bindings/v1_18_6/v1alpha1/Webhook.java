package io.yupiik.kubernetes.bindings.v1_18_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_6.Validable;
import io.yupiik.kubernetes.bindings.v1_18_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Webhook implements Validable<Webhook> {
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
}
