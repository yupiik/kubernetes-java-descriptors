package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import io.yupiik.kubernetes.bindings.v1_20_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_8.Validable;
import io.yupiik.kubernetes.bindings.v1_20_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIServiceSpec implements Validable<APIServiceSpec>, Exportable {
    private String caBundle;
    private String group;
    private int groupPriorityMinimum;
    private Boolean insecureSkipTLSVerify;
    private ServiceReference service;
    private String version;
    private int versionPriority;

    public APIServiceSpec() {
        // no-op
    }

    public APIServiceSpec(final String caBundle,
                          final String group,
                          final int groupPriorityMinimum,
                          final Boolean insecureSkipTLSVerify,
                          final ServiceReference service,
                          final String version,
                          final int versionPriority) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public int getGroupPriorityMinimum() {
        return groupPriorityMinimum;
    }

    public void setGroupPriorityMinimum(final int groupPriorityMinimum) {
        this.groupPriorityMinimum = groupPriorityMinimum;
    }

    public Boolean getInsecureSkipTLSVerify() {
        return insecureSkipTLSVerify;
    }

    public void setInsecureSkipTLSVerify(final Boolean insecureSkipTLSVerify) {
        this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    }

    public ServiceReference getService() {
        return service;
    }

    public void setService(final ServiceReference service) {
        this.service = service;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public int getVersionPriority() {
        return versionPriority;
    }

    public void setVersionPriority(final int versionPriority) {
        this.versionPriority = versionPriority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                group,
                groupPriorityMinimum,
                insecureSkipTLSVerify,
                service,
                version,
                versionPriority);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceSpec)) {
            return false;
        }
        final APIServiceSpec __otherCasted = (APIServiceSpec) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(groupPriorityMinimum, __otherCasted.groupPriorityMinimum) &&
            Objects.equals(insecureSkipTLSVerify, __otherCasted.insecureSkipTLSVerify) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(version, __otherCasted.version) &&
            Objects.equals(versionPriority, __otherCasted.versionPriority);
    }

    public APIServiceSpec caBundle(final String caBundle) {
        this.caBundle = caBundle;
        return this;
    }

    public APIServiceSpec group(final String group) {
        this.group = group;
        return this;
    }

    public APIServiceSpec groupPriorityMinimum(final int groupPriorityMinimum) {
        this.groupPriorityMinimum = groupPriorityMinimum;
        return this;
    }

    public APIServiceSpec insecureSkipTLSVerify(final Boolean insecureSkipTLSVerify) {
        this.insecureSkipTLSVerify = insecureSkipTLSVerify;
        return this;
    }

    public APIServiceSpec service(final ServiceReference service) {
        this.service = service;
        return this;
    }

    public APIServiceSpec version(final String version) {
        this.version = version;
        return this;
    }

    public APIServiceSpec versionPriority(final int versionPriority) {
        this.versionPriority = versionPriority;
        return this;
    }

    @Override
    public APIServiceSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (caBundle != null ? "\"caBundle\":\"" +  JsonStrings.escapeJson(caBundle) + "\"" : ""),
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    "\"groupPriorityMinimum\":" + groupPriorityMinimum,
                    (insecureSkipTLSVerify != null ? "\"insecureSkipTLSVerify\":" + insecureSkipTLSVerify : ""),
                    (service != null ? "\"service\":" + service.asJson() : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""),
                    "\"versionPriority\":" + versionPriority)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
