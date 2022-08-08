package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsMetadataInitializersPending {
    private String name;

    public ValidatingWebhookConfigurationListItemsMetadataInitializersPending() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsMetadataInitializersPending)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsMetadataInitializersPending __otherCasted = (ValidatingWebhookConfigurationListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
