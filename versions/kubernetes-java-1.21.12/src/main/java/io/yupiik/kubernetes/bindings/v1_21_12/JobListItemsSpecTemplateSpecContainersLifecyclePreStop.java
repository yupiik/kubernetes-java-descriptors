package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private JobListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStop(final JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                  final JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                  final JobListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
