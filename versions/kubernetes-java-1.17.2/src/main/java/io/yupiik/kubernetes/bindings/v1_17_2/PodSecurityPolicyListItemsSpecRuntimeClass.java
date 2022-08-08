package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpecRuntimeClass {
    private List<String> allowedRuntimeClassNames;
    private String defaultRuntimeClassName;

    public PodSecurityPolicyListItemsSpecRuntimeClass() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecRuntimeClass(final List<String> allowedRuntimeClassNames,
                                                      final String defaultRuntimeClassName) {
        // no-op
    }

    public List<String> getAllowedRuntimeClassNames() {
        return allowedRuntimeClassNames;
    }

    public void setAllowedRuntimeClassNames(final List<String> allowedRuntimeClassNames) {
        this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    }

    public String getDefaultRuntimeClassName() {
        return defaultRuntimeClassName;
    }

    public void setDefaultRuntimeClassName(final String defaultRuntimeClassName) {
        this.defaultRuntimeClassName = defaultRuntimeClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowedRuntimeClassNames,
                defaultRuntimeClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyListItemsSpecRuntimeClass)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecRuntimeClass __otherCasted = (PodSecurityPolicyListItemsSpecRuntimeClass) __other;
        return Objects.equals(allowedRuntimeClassNames, __otherCasted.allowedRuntimeClassNames) &&
            Objects.equals(defaultRuntimeClassName, __otherCasted.defaultRuntimeClassName);
    }
}
