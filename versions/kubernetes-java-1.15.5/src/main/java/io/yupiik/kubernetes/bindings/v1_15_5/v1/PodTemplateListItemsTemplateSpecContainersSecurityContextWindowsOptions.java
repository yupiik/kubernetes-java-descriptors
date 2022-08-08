package io.yupiik.kubernetes.bindings.v1_15_5.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;

    public PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions(final String gmsaCredentialSpec,
                                                                                   final String gmsaCredentialSpecName) {
        // no-op
    }

    public String getGmsaCredentialSpec() {
        return gmsaCredentialSpec;
    }

    public void setGmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
    }

    public String getGmsaCredentialSpecName() {
        return gmsaCredentialSpecName;
    }

    public void setGmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gmsaCredentialSpec,
                gmsaCredentialSpecName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions __otherCasted = (PodTemplateListItemsTemplateSpecContainersSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName);
    }
}
