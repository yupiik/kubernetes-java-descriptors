package io.yupiik.kubernetes.bindings.v1_22_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_4.Validable;
import io.yupiik.kubernetes.bindings.v1_22_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WindowsSecurityContextOptions implements Validable<WindowsSecurityContextOptions> {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private Boolean hostProcess;
    private String runAsUserName;

    public WindowsSecurityContextOptions() {
        // no-op
    }

    public WindowsSecurityContextOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof WindowsSecurityContextOptions)) {
            return false;
        }
        final WindowsSecurityContextOptions __otherCasted = (WindowsSecurityContextOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
            Objects.equals(hostProcess, __otherCasted.hostProcess) &&
            Objects.equals(runAsUserName, __otherCasted.runAsUserName);
    }

    public WindowsSecurityContextOptions gmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        return this;
    }

    public WindowsSecurityContextOptions gmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        return this;
    }

    public WindowsSecurityContextOptions hostProcess(final Boolean hostProcess) {
        this.hostProcess = hostProcess;
        return this;
    }

    public WindowsSecurityContextOptions runAsUserName(final String runAsUserName) {
        this.runAsUserName = runAsUserName;
        return this;
    }

    @Override
    public WindowsSecurityContextOptions validate() {
        return this;
    }
}
