package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;

    public ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions __otherCasted = (ReplicaSetListItemsSpecTemplateSpecSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName);
    }
}
