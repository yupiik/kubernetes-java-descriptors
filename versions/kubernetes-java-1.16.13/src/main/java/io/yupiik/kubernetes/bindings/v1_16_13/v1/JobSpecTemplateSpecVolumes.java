package io.yupiik.kubernetes.bindings.v1_16_13.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumes {
    private JobSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private JobSpecTemplateSpecVolumesAzureDisk azureDisk;
    private JobSpecTemplateSpecVolumesAzureFile azureFile;
    private JobSpecTemplateSpecVolumesCephfs cephfs;
    private JobSpecTemplateSpecVolumesCinder cinder;
    private JobSpecTemplateSpecVolumesConfigMap configMap;
    private JobSpecTemplateSpecVolumesCsi csi;
    private JobSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private JobSpecTemplateSpecVolumesEmptyDir emptyDir;
    private JobSpecTemplateSpecVolumesFc fc;
    private JobSpecTemplateSpecVolumesFlexVolume flexVolume;
    private JobSpecTemplateSpecVolumesFlocker flocker;
    private JobSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private JobSpecTemplateSpecVolumesGitRepo gitRepo;
    private JobSpecTemplateSpecVolumesGlusterfs glusterfs;
    private JobSpecTemplateSpecVolumesHostPath hostPath;
    private JobSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private JobSpecTemplateSpecVolumesNfs nfs;
    private JobSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private JobSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private JobSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private JobSpecTemplateSpecVolumesProjected projected;
    private JobSpecTemplateSpecVolumesQuobyte quobyte;
    private JobSpecTemplateSpecVolumesRbd rbd;
    private JobSpecTemplateSpecVolumesScaleIO scaleIO;
    private JobSpecTemplateSpecVolumesSecret secret;
    private JobSpecTemplateSpecVolumesStorageos storageos;
    private JobSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public JobSpecTemplateSpecVolumes() {
        // no-op
    }

    public JobSpecTemplateSpecVolumes(final JobSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                      final JobSpecTemplateSpecVolumesAzureDisk azureDisk,
                                      final JobSpecTemplateSpecVolumesAzureFile azureFile,
                                      final JobSpecTemplateSpecVolumesCephfs cephfs,
                                      final JobSpecTemplateSpecVolumesCinder cinder,
                                      final JobSpecTemplateSpecVolumesConfigMap configMap,
                                      final JobSpecTemplateSpecVolumesCsi csi,
                                      final JobSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                      final JobSpecTemplateSpecVolumesEmptyDir emptyDir,
                                      final JobSpecTemplateSpecVolumesFc fc,
                                      final JobSpecTemplateSpecVolumesFlexVolume flexVolume,
                                      final JobSpecTemplateSpecVolumesFlocker flocker,
                                      final JobSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                      final JobSpecTemplateSpecVolumesGitRepo gitRepo,
                                      final JobSpecTemplateSpecVolumesGlusterfs glusterfs,
                                      final JobSpecTemplateSpecVolumesHostPath hostPath,
                                      final JobSpecTemplateSpecVolumesIscsi iscsi,
                                      final String name,
                                      final JobSpecTemplateSpecVolumesNfs nfs,
                                      final JobSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                      final JobSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                      final JobSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                      final JobSpecTemplateSpecVolumesProjected projected,
                                      final JobSpecTemplateSpecVolumesQuobyte quobyte,
                                      final JobSpecTemplateSpecVolumesRbd rbd,
                                      final JobSpecTemplateSpecVolumesScaleIO scaleIO,
                                      final JobSpecTemplateSpecVolumesSecret secret,
                                      final JobSpecTemplateSpecVolumesStorageos storageos,
                                      final JobSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public JobSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final JobSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public JobSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final JobSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public JobSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final JobSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public JobSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final JobSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public JobSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final JobSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public JobSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final JobSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public JobSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final JobSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public JobSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final JobSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public JobSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final JobSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public JobSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final JobSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public JobSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final JobSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public JobSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final JobSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public JobSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final JobSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public JobSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final JobSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public JobSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final JobSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public JobSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final JobSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public JobSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final JobSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public JobSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final JobSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public JobSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final JobSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public JobSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final JobSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public JobSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final JobSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public JobSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final JobSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public JobSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final JobSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public JobSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final JobSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public JobSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final JobSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public JobSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final JobSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public JobSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final JobSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public JobSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final JobSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecVolumes)) {
            return false;
        }
        final JobSpecTemplateSpecVolumes __otherCasted = (JobSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
