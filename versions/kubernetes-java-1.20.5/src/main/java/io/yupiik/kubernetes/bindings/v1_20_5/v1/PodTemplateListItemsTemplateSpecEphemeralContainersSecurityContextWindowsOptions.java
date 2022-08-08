package io.yupiik.kubernetes.bindings.v1_20_5.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private String runAsUserName;

    public PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
            Objects.equals(runAsUserName, __otherCasted.runAsUserName);
    }
}
