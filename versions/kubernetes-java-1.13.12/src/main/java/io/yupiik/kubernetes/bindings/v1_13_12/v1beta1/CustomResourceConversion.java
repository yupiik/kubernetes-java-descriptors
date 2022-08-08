package io.yupiik.kubernetes.bindings.v1_13_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_12.Validable;
import io.yupiik.kubernetes.bindings.v1_13_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceConversion implements Validable<CustomResourceConversion> {
    private String strategy;
    private WebhookClientConfig webhookClientConfig;

    public CustomResourceConversion() {
        // no-op
    }

    public CustomResourceConversion(final String strategy,
                                    final WebhookClientConfig webhookClientConfig) {
        // no-op
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public WebhookClientConfig getWebhookClientConfig() {
        return webhookClientConfig;
    }

    public void setWebhookClientConfig(final WebhookClientConfig webhookClientConfig) {
        this.webhookClientConfig = webhookClientConfig;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strategy,
                webhookClientConfig);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceConversion)) {
            return false;
        }
        final CustomResourceConversion __otherCasted = (CustomResourceConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhookClientConfig, __otherCasted.webhookClientConfig);
    }

    public CustomResourceConversion strategy(final String strategy) {
        this.strategy = strategy;
        return this;
    }

    public CustomResourceConversion webhookClientConfig(final WebhookClientConfig webhookClientConfig) {
        this.webhookClientConfig = webhookClientConfig;
        return this;
    }

    @Override
    public CustomResourceConversion validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (strategy == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "strategy", "strategy",
                "Missing 'strategy' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
