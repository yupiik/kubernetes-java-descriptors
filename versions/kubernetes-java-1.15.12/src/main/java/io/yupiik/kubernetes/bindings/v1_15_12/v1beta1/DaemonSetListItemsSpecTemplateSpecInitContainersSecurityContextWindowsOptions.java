package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName);
    }
}
