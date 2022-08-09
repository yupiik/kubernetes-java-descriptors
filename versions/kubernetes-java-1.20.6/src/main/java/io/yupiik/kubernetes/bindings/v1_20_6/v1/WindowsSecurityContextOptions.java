package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import io.yupiik.kubernetes.bindings.v1_20_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_6.Validable;
import io.yupiik.kubernetes.bindings.v1_20_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WindowsSecurityContextOptions implements Validable<WindowsSecurityContextOptions>, Exportable {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private String runAsUserName;

    public WindowsSecurityContextOptions() {
        // no-op
    }

    public WindowsSecurityContextOptions(final String gmsaCredentialSpec,
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
        if (!(__other instanceof WindowsSecurityContextOptions)) {
            return false;
        }
        final WindowsSecurityContextOptions __otherCasted = (WindowsSecurityContextOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
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

    public WindowsSecurityContextOptions runAsUserName(final String runAsUserName) {
        this.runAsUserName = runAsUserName;
        return this;
    }

    @Override
    public WindowsSecurityContextOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (gmsaCredentialSpec != null ? "\"gmsaCredentialSpec\":\"" +  JsonStrings.escapeJson(gmsaCredentialSpec) + "\"" : ""),
                    (gmsaCredentialSpecName != null ? "\"gmsaCredentialSpecName\":\"" +  JsonStrings.escapeJson(gmsaCredentialSpecName) + "\"" : ""),
                    (runAsUserName != null ? "\"runAsUserName\":\"" +  JsonStrings.escapeJson(runAsUserName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
