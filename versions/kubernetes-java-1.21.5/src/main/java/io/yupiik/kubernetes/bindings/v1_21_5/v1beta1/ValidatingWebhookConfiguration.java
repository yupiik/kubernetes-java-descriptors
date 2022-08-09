package io.yupiik.kubernetes.bindings.v1_21_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_5.Validable;
import io.yupiik.kubernetes.bindings.v1_21_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingWebhookConfiguration implements Validable<ValidatingWebhookConfiguration>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<ValidatingWebhook> webhooks;

    public ValidatingWebhookConfiguration() {
        // no-op
    }

    public ValidatingWebhookConfiguration(final String apiVersion,
                                          final String kind,
                                          final ObjectMeta metadata,
                                          final List<ValidatingWebhook> webhooks) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<ValidatingWebhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<ValidatingWebhook> webhooks) {
        this.webhooks = webhooks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                webhooks);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfiguration)) {
            return false;
        }
        final ValidatingWebhookConfiguration __otherCasted = (ValidatingWebhookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }

    public ValidatingWebhookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ValidatingWebhookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ValidatingWebhookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ValidatingWebhookConfiguration webhooks(final List<ValidatingWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    @Override
    public ValidatingWebhookConfiguration validate() {
        if (kind == null) {
            kind = "ValidatingWebhookConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1beta1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (webhooks != null ? "\"webhooks\":" + webhooks.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
