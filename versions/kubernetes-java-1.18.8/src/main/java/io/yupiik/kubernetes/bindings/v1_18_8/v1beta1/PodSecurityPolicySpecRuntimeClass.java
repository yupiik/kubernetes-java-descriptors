package io.yupiik.kubernetes.bindings.v1_18_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecRuntimeClass {
    private List<String> allowedRuntimeClassNames;
    private String defaultRuntimeClassName;

    public PodSecurityPolicySpecRuntimeClass() {
        // no-op
    }

    public PodSecurityPolicySpecRuntimeClass(final List<String> allowedRuntimeClassNames,
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
        if (!(__other instanceof PodSecurityPolicySpecRuntimeClass)) {
            return false;
        }
        final PodSecurityPolicySpecRuntimeClass __otherCasted = (PodSecurityPolicySpecRuntimeClass) __other;
        return Objects.equals(allowedRuntimeClassNames, __otherCasted.allowedRuntimeClassNames) &&
            Objects.equals(defaultRuntimeClassName, __otherCasted.defaultRuntimeClassName);
    }
}
