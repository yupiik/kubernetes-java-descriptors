package io.yupiik.kubernetes.bindings.v1_16_14;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private String runAsUserName;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions(final String gmsaCredentialSpec,
                                                                                               final String gmsaCredentialSpecName,
                                                                                               final String runAsUserName) {
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

    public String getRunAsUserName() {
        return runAsUserName;
    }

    public void setRunAsUserName(final String runAsUserName) {
        this.runAsUserName = runAsUserName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gmsaCredentialSpec,
                gmsaCredentialSpecName,
                runAsUserName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
            Objects.equals(runAsUserName, __otherCasted.runAsUserName);
    }
}
