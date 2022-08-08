package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef {
    private String key;
    private String name;
    private Boolean optional;

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef(final String key,
                                                                                    final String name,
                                                                                    final Boolean optional) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
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
                key,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
