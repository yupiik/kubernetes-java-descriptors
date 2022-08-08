package io.yupiik.kubernetes.bindings.v1_19_15.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private JobListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStart(final JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                    final JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                    final JobListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
