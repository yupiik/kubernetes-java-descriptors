package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                             final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                             final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
