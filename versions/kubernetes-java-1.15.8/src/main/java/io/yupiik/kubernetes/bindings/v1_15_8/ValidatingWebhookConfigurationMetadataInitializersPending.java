package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.Objects;

public class ValidatingWebhookConfigurationMetadataInitializersPending {
    private String name;

    public ValidatingWebhookConfigurationMetadataInitializersPending() {
        // no-op
    }

    public ValidatingWebhookConfigurationMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfigurationMetadataInitializersPending)) {
            return false;
        }
        final ValidatingWebhookConfigurationMetadataInitializersPending __otherCasted = (ValidatingWebhookConfigurationMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
