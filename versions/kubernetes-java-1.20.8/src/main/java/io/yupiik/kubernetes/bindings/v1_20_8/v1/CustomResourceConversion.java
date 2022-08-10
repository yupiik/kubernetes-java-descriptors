package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import io.yupiik.kubernetes.bindings.v1_20_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_8.Validable;
import io.yupiik.kubernetes.bindings.v1_20_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceConversion implements Validable<CustomResourceConversion>, Exportable {
    private String strategy;
    private WebhookConversion webhook;

    public CustomResourceConversion() {
        // no-op
    }

    public CustomResourceConversion(final String strategy,
                                    final WebhookConversion webhook) {
        // no-op
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public WebhookConversion getWebhook() {
        return webhook;
    }

    public void setWebhook(final WebhookConversion webhook) {
        this.webhook = webhook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strategy,
                webhook);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceConversion)) {
            return false;
        }
        final CustomResourceConversion __otherCasted = (CustomResourceConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }

    public CustomResourceConversion strategy(final String strategy) {
        this.strategy = strategy;
        return this;
    }

    public CustomResourceConversion webhook(final WebhookConversion webhook) {
        this.webhook = webhook;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (strategy != null ? "\"strategy\":\"" +  JsonStrings.escapeJson(strategy) + "\"" : ""),
                    (webhook != null ? "\"webhook\":" + webhook.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}