package io.yupiik.kubernetes.bindings.v1_19_7;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumes {
    private ReplicationControllerListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesCinder cinder;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesCsi csi;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral ephemeral;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesFc fc;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesFlocker flocker;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesNfs nfs;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesProjected projected;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesRbd rbd;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesSecret secret;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesStorageos storageos;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public ReplicationControllerListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumes(final ReplicationControllerListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesCinder cinder,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesCsi csi,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral ephemeral,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesFc fc,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesFlocker flocker,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                                                 final String name,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesNfs nfs,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesProjected projected,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesRbd rbd,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesSecret secret,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesStorageos storageos,
                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final ReplicationControllerListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final ReplicationControllerListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final ReplicationControllerListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final ReplicationControllerListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final ReplicationControllerListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicationControllerListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final ReplicationControllerListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final ReplicationControllerListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final ReplicationControllerListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final ReplicationControllerListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final ReplicationControllerListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final ReplicationControllerListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ReplicationControllerListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final ReplicationControllerListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final ReplicationControllerListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final ReplicationControllerListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final ReplicationControllerListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final ReplicationControllerListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicationControllerListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final ReplicationControllerListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumes __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
