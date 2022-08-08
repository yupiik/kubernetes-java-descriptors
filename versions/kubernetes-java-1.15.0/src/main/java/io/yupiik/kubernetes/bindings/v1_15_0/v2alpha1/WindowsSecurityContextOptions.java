package io.yupiik.kubernetes.bindings.v1_15_0.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_0.Validable;
import io.yupiik.kubernetes.bindings.v1_15_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WindowsSecurityContextOptions implements Validable<WindowsSecurityContextOptions> {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;

    public WindowsSecurityContextOptions() {
        // no-op
    }

    public WindowsSecurityContextOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof WindowsSecurityContextOptions)) {
            return false;
        }
        final WindowsSecurityContextOptions __otherCasted = (WindowsSecurityContextOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName);
    }

    public WindowsSecurityContextOptions gmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        return this;
    }

    public WindowsSecurityContextOptions gmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        return this;
    }

    @Override
    public WindowsSecurityContextOptions validate() {
        return this;
    }
}
