package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private Boolean hostProcess;
    private String runAsUserName;

    public JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions(final String gmsaCredentialSpec,
                                                                                   final String gmsaCredentialSpecName,
                                                                                   final Boolean hostProcess,
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

    public Boolean getHostProcess() {
        return hostProcess;
    }

    public void setHostProcess(final Boolean hostProcess) {
        this.hostProcess = hostProcess;
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
                hostProcess,
                runAsUserName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions __otherCasted = (JobListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
            Objects.equals(hostProcess, __otherCasted.hostProcess) &&
            Objects.equals(runAsUserName, __otherCasted.runAsUserName);
    }
}
