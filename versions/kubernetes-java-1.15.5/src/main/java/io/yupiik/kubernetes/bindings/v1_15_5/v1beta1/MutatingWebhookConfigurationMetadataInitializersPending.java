package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import java.util.Objects;

public class MutatingWebhookConfigurationMetadataInitializersPending {
    private String name;

    public MutatingWebhookConfigurationMetadataInitializersPending() {
        // no-op
    }

    public MutatingWebhookConfigurationMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof MutatingWebhookConfigurationMetadataInitializersPending)) {
            return false;
        }
        final MutatingWebhookConfigurationMetadataInitializersPending __otherCasted = (MutatingWebhookConfigurationMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
