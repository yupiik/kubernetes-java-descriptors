package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef {
    private String name;
    private Boolean optional;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef(final String name,
                                                                                                final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
