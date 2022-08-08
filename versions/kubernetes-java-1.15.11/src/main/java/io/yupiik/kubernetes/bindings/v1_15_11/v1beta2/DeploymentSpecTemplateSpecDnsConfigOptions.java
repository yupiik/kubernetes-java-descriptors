package io.yupiik.kubernetes.bindings.v1_15_11.v1beta2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecDnsConfigOptions {
    private String name;
    private String value;

    public DeploymentSpecTemplateSpecDnsConfigOptions() {
        // no-op
    }

    public DeploymentSpecTemplateSpecDnsConfigOptions(final String name,
                                                      final String value) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecDnsConfigOptions)) {
            return false;
        }
        final DeploymentSpecTemplateSpecDnsConfigOptions __otherCasted = (DeploymentSpecTemplateSpecDnsConfigOptions) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
